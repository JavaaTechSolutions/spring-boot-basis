package com.jts;

import java.util.List;

public record Order(String title, String description, List<Products> products) {

}
