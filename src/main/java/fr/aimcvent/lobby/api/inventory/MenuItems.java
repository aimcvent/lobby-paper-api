package fr.aimcvent.lobby.api.inventory;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;

public interface MenuItems {
    Collection<MenuItem> all();

    Map<Integer, String> configuration();

    Optional<MenuItem> of(String identifier);

    void register(MenuItem item);
}
