package com.msa.reserve.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "reserve")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Reserve {

}
