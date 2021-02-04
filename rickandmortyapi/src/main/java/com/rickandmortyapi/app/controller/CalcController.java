package com.rickandmortyapi.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rickandmortyapi.app.middleware.EvaDTO;
import com.rickandmortyapi.app.middleware.ResDTO;
import com.rickandmortyapi.app.middleware.ResHappyDTO;

@RestController
public class CalcController {
	
	private boolean check(String num, List<Integer> cache) {
		int acum = 0;
		int digit = 0;
		for (int digitPos = 0; digitPos < num.length(); digitPos++) {
			digit = Integer.parseInt(String.valueOf(num.charAt(digitPos)));
			acum += digit * digit;
		}
		if (acum == 1) {
			return true;
		}
		if (cache.contains(acum)) {
			return false;
		}
		cache.add(acum);
		return check(String.valueOf(acum), cache);
	}
	
	@GetMapping("/ishappy")
	@ResponseBody
	public ResHappyDTO ishappy(@RequestParam List<String> numList) {
		boolean res = false;
		List<EvaDTO> resList = new ArrayList<>();
		List<Integer> cache;
		for (String n : numList) {
			cache = new ArrayList<>();
			res = check(n, cache);
			resList.add(new EvaDTO(Integer.parseInt(n), res));
		}
		return new ResHappyDTO(resList);
	}
	
	@GetMapping("/calc/{num}")
	public ResDTO calc(@PathVariable Long num) {
		int acum = 0;
		for (int n=1; n <= num; n++) {
			acum += n;
		}
		return new ResDTO(acum);
	}

}
