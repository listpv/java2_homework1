package ru.geekbrains.Course;

import ru.geekbrains.Competitors.Competitor;
import ru.geekbrains.Competitors.Team;

public class Course
{
    public Obstacle[] obstacle;

    public Course(Obstacle... obstacle)
    {
        this.obstacle = obstacle;
    }

    public void doIt(Team team)
    {
        team.teamInfo();

        for (Competitor c : team.competitors)
        {
            for (Obstacle o : obstacle)
            {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }

        team.distanceInfo();
    }
}
