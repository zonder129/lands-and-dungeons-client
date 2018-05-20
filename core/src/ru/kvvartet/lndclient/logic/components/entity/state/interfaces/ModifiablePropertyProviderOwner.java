package ru.kvvartet.lndclient.logic.components.entity.state.interfaces;

import org.jetbrains.annotations.NotNull;
import ru.kvvartet.lndclient.logic.components.entity.state.adapters.properties.ModifiablePropertyProvider;

public interface ModifiablePropertyProviderOwner {
    @NotNull ModifiablePropertyProvider getProperties();
}
