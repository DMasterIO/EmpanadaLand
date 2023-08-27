
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.dmaster.empanadaland.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import io.dmaster.empanadaland.item.VasoTerremotoItem;
import io.dmaster.empanadaland.item.VasoChupilcaItem;
import io.dmaster.empanadaland.item.QuesoItem;
import io.dmaster.empanadaland.item.MasaMadreItem;
import io.dmaster.empanadaland.item.HarinaItem;
import io.dmaster.empanadaland.item.EmpanadaQuesoItem;
import io.dmaster.empanadaland.item.EmpanadaPinoItem;
import io.dmaster.empanadaland.item.EmpanadaPastelChocloItem;
import io.dmaster.empanadaland.EmpanadalandMod;

public class EmpanadalandModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EmpanadalandMod.MODID);
	public static final RegistryObject<Item> EMPANADA_PINO = REGISTRY.register("empanada_pino", () -> new EmpanadaPinoItem());
	public static final RegistryObject<Item> EMPANADA_QUESO = REGISTRY.register("empanada_queso", () -> new EmpanadaQuesoItem());
	public static final RegistryObject<Item> EMPANADA_PASTEL_CHOCLO = REGISTRY.register("empanada_pastel_choclo", () -> new EmpanadaPastelChocloItem());
	public static final RegistryObject<Item> VASO_CHUPILCA = REGISTRY.register("vaso_chupilca", () -> new VasoChupilcaItem());
	public static final RegistryObject<Item> QUESO = REGISTRY.register("queso", () -> new QuesoItem());
	public static final RegistryObject<Item> MASA_MADRE = REGISTRY.register("masa_madre", () -> new MasaMadreItem());
	public static final RegistryObject<Item> HARINA = REGISTRY.register("harina", () -> new HarinaItem());
	public static final RegistryObject<Item> VASO_TERREMOTO = REGISTRY.register("vaso_terremoto", () -> new VasoTerremotoItem());
}
