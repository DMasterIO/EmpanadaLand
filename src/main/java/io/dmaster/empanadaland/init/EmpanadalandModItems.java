
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.dmaster.empanadaland.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import io.dmaster.empanadaland.item.EmpanadaQuesoItem;
import io.dmaster.empanadaland.item.EmpanadaPinoItem;
import io.dmaster.empanadaland.item.EmpanadaPastelChocloItem;
import io.dmaster.empanadaland.EmpanadalandMod;

public class EmpanadalandModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EmpanadalandMod.MODID);
	public static final RegistryObject<Item> EMPANADA_PINO = REGISTRY.register("empanada_pino", () -> new EmpanadaPinoItem());
	public static final RegistryObject<Item> EMPANADA_QUESO = REGISTRY.register("empanada_queso", () -> new EmpanadaQuesoItem());
	public static final RegistryObject<Item> EMPANADA_PASTEL_CHOCLO = REGISTRY.register("empanada_pastel_choclo",
			() -> new EmpanadaPastelChocloItem());
}
