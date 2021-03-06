package ru.kvvartet.lndclient.client.states.manager;

import org.jetbrains.annotations.NotNull;

import ru.kvvartet.lndclient.client.network.controller.AuthorizationController;
import ru.kvvartet.lndclient.client.network.manager.NetworkManager;
import ru.kvvartet.lndclient.client.states.state.GameState;

public interface StateManager {
    void requestStatePop();

    void requestStateClear();

    void requestStatePush(@NotNull GameState gameState);

    void update(float timeDelta);

    NetworkManager getNetworkManager();

    AuthorizationController getAuthorizationController();
}
