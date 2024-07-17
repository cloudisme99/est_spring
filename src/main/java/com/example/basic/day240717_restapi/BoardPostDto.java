package com.example.basic.day240717_restapi;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BoardPostDto {
	private Long id;
	private String title;
	private String content;
	private String author;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	private List<CommentDto> comments = new ArrayList<>();
}
