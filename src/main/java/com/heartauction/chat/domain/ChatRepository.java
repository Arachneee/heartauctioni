package com.heartauction.chat.domain;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat, Long> {
    List<Chat> findAllByAuctionId(Long donationId);
}
