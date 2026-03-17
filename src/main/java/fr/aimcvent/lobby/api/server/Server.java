package fr.aimcvent.lobby.api.server;

import java.util.UUID;

public interface Server {
    UUID id();

    String type();

    String name();

    String displayName();

    State state();

    int players();

    int maxPlayers();

    String network();

    String port();

    String version();

    int permission();
}
