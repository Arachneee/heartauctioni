package com.heartauction.auction.application.response;

import com.heartauction.auction.domain.Auction;
import com.heartauction.auction.domain.Donation;
import com.heartauction.auth.LoginMember;
import java.time.LocalDateTime;

public record AuctionResponse(
        Long id,
        String title,
        String description,
        String memberName,
        Long startPrice,
        LocalDateTime startDateTime
) {
    public static AuctionResponse of(Auction auction, LoginMember member) {
        Donation donation = auction.getDonation();
        return new AuctionResponse(
                donation.getId(), donation.getTitle(), donation.getDescription(), member.name(),
                auction.getStartPrice().getValue(), auction.getStartDateTime()
        );
    }
}
