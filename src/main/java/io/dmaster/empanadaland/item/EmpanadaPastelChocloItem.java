
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

import io.dmaster.empanadaland.procedures.EmpanadaPastelChocloPlayerFinishesUsingItemProcedure;

public class EmpanadaPastelChocloItem extends Item {
	public EmpanadaPastelChocloItem() {
		super(new Item.Properties()
			.stacksTo(64)
			.rarity(Rarity.RARE)
			.food(new FoodProperties.Builder()
				.nutrition(5)
				.saturationModifier(0.6f)
				.alwaysEdible()
				.meat()
				.build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.literal("Empanada Pastel de Choclo"));
		list.add(Component.literal("El mejor invento"));
		list.add(Component.literal("Visi\u00F3n Nocturna"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		EmpanadaPastelChocloPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}
