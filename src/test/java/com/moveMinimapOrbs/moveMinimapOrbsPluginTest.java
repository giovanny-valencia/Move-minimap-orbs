package com.moveMinimapOrbs;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class moveMinimapOrbsPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(moveMinimapOrbsPlugin.class);
		RuneLite.main(args);
	}
}