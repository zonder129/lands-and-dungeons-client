package ru.kvvartet.lndclient.logic.components.entity.graphics;

import com.badlogic.gdx.graphics.g2d.Animation;
import org.jetbrains.annotations.NotNull;
import ru.kvvartet.lndclient.logic.components.entity.AbstractComponent;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class GraphicsComponent extends AbstractComponent {
    private static final AtomicInteger INSTANCE_COUNTER = new AtomicInteger(0);

    private final Integer id = INSTANCE_COUNTER.getAndIncrement();

    protected final Map<String, Animation> animations = new HashMap<>();

    @Override
    public @NotNull Integer getId() {
        return id;
    }
}
