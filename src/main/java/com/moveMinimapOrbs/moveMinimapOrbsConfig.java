package com.moveMinimapOrbs;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("moveMinimapOrbs")
public interface moveMinimapOrbsConfig extends Config
{
	String descriptionStart = "Toggle to allow movement of";
	String descriptionEnd = "when alt is held";

	@ConfigItem(
			keyName = "hpOrbConfig",
			name = "Hitpoints",
			description = descriptionStart + " hitpoints orb " + descriptionEnd
	)
	default boolean enableHpOrbMovement()
	{
		return true;
	}

	@ConfigItem(
			keyName = "prayerOrbConfig",
			name = "Prayer",
			description = descriptionStart + " prayer orb " + descriptionEnd)
	default boolean enablePrayerOrbMovement()
	{
		return true;
	}

	@ConfigItem(
			keyName = "runOrbConfig",
			name = "Run",
			description = descriptionStart + " run orb " + descriptionEnd)
	default boolean enableRunOrbMovement()
	{
		return true;
	}

	@ConfigItem(
			keyName = "specialOrbConfig",
			name = "Special Attack",
			description = descriptionStart + " special attack orb " + descriptionEnd)
	default boolean enableSpecialOrbMovement()
	{
		return true;
	}

}
