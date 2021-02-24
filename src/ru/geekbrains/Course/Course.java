package ru.geekbrains;

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
