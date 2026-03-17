package fr.aimcvent.lobby.api.server;

import java.util.List;
import java.util.UUID;

public interface Servers {
    List<Server> all();

    Server of(UUID id);
}
