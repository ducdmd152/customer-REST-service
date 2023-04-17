package com.ducdmd152.springbootrest.dto;

import java.io.Serializable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class APIPageableDTO implements Serializable {
	
	int pageNumber;
	int pageSize;
	int offset;
	int totalElements;
	int totalPages;
	int numberOfElements;
	boolean sorted;
	boolean first;
	boolean last;
	boolean empty;
	
	public APIPageableDTO() {
	}
	
	public <T> APIPageableDTO(Page<T> page) {
		Pageable pageable = page.getPageable();
		setPageNumber(pageable.getPageNumber());
		setPageSize(pageable.getPageSize());
		setTotalElements(pageable.getPageSize());
		setTotalPages(page.getTotalPages());
		setNumberOfElements(page.getNumberOfElements());
		setSorted(page.getSort().isSorted());
		setFirst(page.isFirst());
		setFirst(page.isLast());
		setFirst(page.isEmpty());
	}
	
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int size) {
		this.pageSize = size;
	}
	public int getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(int totalElements) {
		this.totalElements = totalElements;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public int getNumberOfElements() {
		return numberOfElements;
	}
	public void setNumberOfElements(int numberOfElements) {
		this.numberOfElements = numberOfElements;
	}
	public boolean isSorted() {
		return sorted;
	}
	public void setSorted(boolean sorted) {
		this.sorted = sorted;
	}
	public boolean isFirst() {
		return first;
	}
	public void setFirst(boolean first) {
		this.first = first;
	}
	public boolean isLast() {
		return last;
	}
	public void setLast(boolean last) {
		this.last = last;
	}
	
	
}
