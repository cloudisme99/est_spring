package com.example.basic.day240715.practice2;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Post {

	private long id;
	private String title;
	private String content;
	private LocalDateTime createAt;
}
