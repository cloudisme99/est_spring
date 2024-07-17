package com.example.basic.day240717_restapi;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CommentDto {
	private Long id;
	private String content;
	private String author;
	private LocalDateTime createdAt;

}
