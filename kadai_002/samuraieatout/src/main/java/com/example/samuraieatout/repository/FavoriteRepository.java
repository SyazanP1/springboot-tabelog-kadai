package com.example.samuraieatout.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraieatout.entity.Favorite;
import com.example.samuraieatout.entity.Member;
import com.example.samuraieatout.entity.Restaurant;

public interface FavoriteRepository extends JpaRepository<Favorite, Integer>{

	Favorite findByMemberAndRestaurant(Member member, Restaurant restaurant);
	
	Page<Favorite> findByMemberOrderByIdAsc(Member member, Pageable pageable);

	//	店舗削除時、同時に削除対象となるレコードを取得
//	Favorite findByRestaurant(Restaurant restaurant);
	Integer deleteByRestaurant(Restaurant restaurant);
}
