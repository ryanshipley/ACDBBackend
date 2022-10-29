package com.shipley.app.ac.models;

import java.util.Date;
import javax.persistence.*;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;                //The game's id.

    @Column
    private String gameName;        //The game's name.

    @Column
    private String charName;        //The game's main character(s).

    @Column
    private Date releaseDate;     //The game's release date.

    @Column
    private String setting;         //The game's setting.

    @Column
    private String description;     //The game's description.

    @Column
    private String poster;          //The game's poster.

    @Column
    private String logo;            //The game's logo.

    @Column
    private String charPic;         //The game's character pictures.

    @Column
    private String trailer;         //The game's trailer.

    @Column
    private String website;         //The game's website.

    @Column
    private String history;         //The game's external history data.


    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getGameName(){
        return gameName;
    }

    public void setGameName(String gameName){
        this.gameName = gameName;
    }

    public String getCharName(){
        return charName;
    }

    public void setCharName(String charName){
        this.charName = charName;
    }

    public Date getReleaseDate(){
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate){
        this.releaseDate = releaseDate;
    }

    public String getSetting(){
        return setting;
    }

    public void setSetting(String setting){
        this.setting = setting;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getPoster(){
        return poster;
    }

    public void setPoster(String poster){
        this.poster = poster;
    }

    public String getLogo(){
        return logo;
    }

    public void setLogo(String logo){
        this.logo = logo;
    }

    public String getCharPic(){
        return charPic;
    }

    public void setCharPic(String charPic){
        this.charPic = charPic;
    }

    public String getTrailer(){
        return trailer;
    }

    public void setTrailer(String trailer){
        this.trailer = trailer;
    }

    public String getWebsite(){
        return website;
    }

    public void setWebsite(String website){
        this.website = website;
    }

    public String getHistory(){
        return history;
    }

    public void setHistory(String history){
        this.history = history;
    }
}