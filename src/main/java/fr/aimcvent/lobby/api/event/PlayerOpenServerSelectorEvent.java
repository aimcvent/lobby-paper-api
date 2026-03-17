package fr.aimcvent.lobby.api.event;

import fr.aimcvent.player.api.Player;
import fr.aimcvent.player.api.event.PlayerEvent;

public class PlayerOpenServerSelectorEvent extends PlayerEvent {
    private final org.bukkit.entity.Player bukkitPlayer;

    public PlayerOpenServerSelectorEvent(Player player, org.bukkit.entity.Player bukkitPlayer) {
        super(player);
        this.bukkitPlayer = bukkitPlayer;
    }

    public org.bukkit.entity.Player bukkitPlayer() {
        return this.bukkitPlayer;
    }
}
