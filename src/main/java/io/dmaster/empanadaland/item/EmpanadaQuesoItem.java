
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

import io.dmaster.empanadaland.procedures.EmpanadaQuesoPlayerFinishesUsingItemProcedure;
import io.dmaster.empanadaland.init.EmpanadalandModTabs;

public class EmpanadaQuesoItem extends Item {
	public EmpanadaQuesoItem() {
		super(new Item.Properties().tab(EmpanadalandModTabs.TAB_EMPANADA_LAND).stacksTo(64).rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.3f).alwaysEat()

				.build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Empanada de Queso"));
		list.add(Component.literal("Jugosa y Caliente"));
		list.add(Component.literal("Velocidad de ni\u00F1os con caf\u00E9"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		EmpanadaQuesoPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
