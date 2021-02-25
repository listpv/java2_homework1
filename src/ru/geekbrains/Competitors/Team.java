package ru.geekbrains.Competitors;

public class Team
{
    private String teamName;
    public Competitor[] competitors;

    public Team(String teamName, Competitor... competitors)
    {
        this.teamName = teamName;
        this.competitors = competitors;
    }

    public void distanceInfo()
    {
        for (Competitor c : competitors)
        {
            c.info();
        }
    }

    public void teamInfo()
    {
        System.out.print("Команда '" + teamName + "': ");
        for (Competitor c : competitors)
        {
            System.out.print(c.getName() + ", ");
        }
        System.out.println();
    }


}
