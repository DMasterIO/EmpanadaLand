
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.dmaster.empanadaland.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import io.dmaster.empanadaland.EmpanadalandMod;

public class EmpanadalandModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EmpanadalandMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TAB_EMPANADA_LAND = REGISTRY.register("empanada_land",
		() -> CreativeModeTab.builder()
			.title(Component.translatable("item_group.empanadaland.empanada_land"))
			.icon(() -> new ItemStack(EmpanadalandModItems.EMPANADA_QUESO.get()))
			.displayItems((parameters, tabData) -> {
				tabData.accept(EmpanadalandModItems.EMPANADA_PINO.get());
				tabData.accept(EmpanadalandModItems.EMPANADA_QUESO.get());
				tabData.accept(EmpanadalandModItems.EMPANADA_PASTEL_CHOCLO.get());
				tabData.accept(EmpanadalandModItems.VASO_CHUPILCA.get());
				tabData.accept(EmpanadalandModItems.QUESO.get());
				tabData.accept(EmpanadalandModItems.MASA_MADRE.get());
				tabData.accept(EmpanadalandModItems.HARINA.get());
				tabData.accept(EmpanadalandModItems.VASO_TERREMOTO.get());
			})
			.build());

	public static void load(IEventBus modEventBus) {
		REGISTRY.register(modEventBus);
	}
}
