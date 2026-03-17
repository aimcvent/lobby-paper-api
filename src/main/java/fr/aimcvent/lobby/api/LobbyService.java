package fr.aimcvent.lobby.api;

import fr.aimcvent.kernel.api.configuration.WithConfiguration;
import fr.aimcvent.kernel.api.service.Service;
import fr.aimcvent.lobby.api.inventory.MenuItems;
import fr.aimcvent.lobby.api.server.Servers;
import fr.aimcvent.player.api.Player;
import org.bukkit.Location;
import org.bukkit.NamespacedKey;

public interface LobbyService extends Service, WithConfiguration {
    Servers servers();

    Location spawnLocation();

    MenuItems items();

    NamespacedKey serverSelectorNamespace();

    void resetPlayer(Player player, org.bukkit.entity.Player bukkitPlayer);
}
