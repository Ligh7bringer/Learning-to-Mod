package com.lightbringer.test;

import com.lightbringer.test.proxy.IProxy;
import com.lightbringer.test.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class test {

    @Mod.Instance(Reference.MOD_ID)
    public static test instance;

    @SidedProxy(clientSide="com.lightbringer.test.proxy.ClientProxy", serverSide="com.lightbringer.test.proxy.ServerProxy")
    public static IProxy proxy;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
