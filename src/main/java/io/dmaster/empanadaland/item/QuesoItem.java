
package io.dmaster.empanadaland.item;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.network.chat.Component;

import java.util.function.Consumer;

public class QuesoItem extends Item {
	public QuesoItem() {
		super(new Item.Properties()
			.stacksTo(64)
			.rarity(Rarity.UNCOMMON)
			.food(new FoodProperties.Builder()
				.nutrition(3)
				.saturationModifier(0.3f)
				.build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay display, Consumer<Component> components, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, display, components, flag);
		components.accept(Component.literal("Queso fresco"));
		components.accept(Component.literal("ideal para empanadas"));
	}
}
