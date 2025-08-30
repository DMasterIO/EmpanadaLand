
package io.dmaster.empanadaland.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import java.util.function.Consumer;

import io.dmaster.empanadaland.procedures.EmpanadaQuesoPlayerFinishesUsingItemProcedure;

public class EmpanadaQuesoItem extends Item {
	public EmpanadaQuesoItem() {
		super(new Item.Properties()
			.stacksTo(64)
			.rarity(Rarity.UNCOMMON)
			.food(new FoodProperties.Builder()
				.nutrition(5)
				.saturationModifier(0.3f)
				.alwaysEdible()
				.build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay display, Consumer<Component> components, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, display, components, flag);
		components.accept(Component.literal("Empanada de Queso"));
		components.accept(Component.literal("Jugosa y Caliente"));
		components.accept(Component.literal("Velocidad de niños con café"));
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
