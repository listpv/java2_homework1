package ru.geekbrains.Course;

import ru.geekbrains.Competitors.Competitor;

public class Wall extends Obstacle
{
    int height;

    public Wall(int height)
    {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor)
    {
        competitor.jump(height);
    }

}
