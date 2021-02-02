package ru.specialist.builder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ru.specialist.house.House;
import ru.specialist.material.Brick;
import ru.specialist.window.Window;
import ru.specialist.window.WoodFrameWindow;

@Configuration
public class BuilderConfig
{
    @Bean("wall")
    @Scope("prototype")
    public Brick bricks() {
        return new Brick();
    }

    @Bean
    public Window woodFrameWindow() {
        return new WoodFrameWindow();
    }

    @Bean
    public House house() {
        House house = new House(woodFrameWindow());
        house.setHeight(2);
        return house;
    }
}
