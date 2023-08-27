
package io.dmaster.empanadaland.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import java.util.List;

import io.dmaster.empanadaland.procedures.EmpanadaPinoPlayerFinishesUsingItemProcedure;
import io.dmaster.empanadaland.init.EmpanadalandModTabs;

public class EmpanadaPinoItem extends Item {
	public EmpanadaPinoItem() {
		super(new Item.Properties().tab(EmpanadalandModTabs.TAB_EMPANADA_LAND).stacksTo(64).rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.6f).alwaysEat().meat().build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Empanada de Pino"));
		list.add(Component.literal("Con carne picada y sin pasas!"));
		list.add(Component.literal("Da Fuerza de Huaso"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		EmpanadaPinoPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
