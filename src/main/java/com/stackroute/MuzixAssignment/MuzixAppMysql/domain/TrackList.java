package com.stackroute.MuzixAssignment.MuzixAppMysql.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackList {
    public List<Track> track;
}
