package ru.scorpio92.vkmd2.data.entity;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Index;

@Entity(
        tableName = "OnlineSearchTable",
        indices = {@Index(value = {"trackId"}, unique = true)}
)
public class OnlineTrack extends BaseTrack {

}
