package com.rocketseat.passin.dto.attendee;

import java.time.LocalDateTime;

public record AttendeeDetails(
        String id,
        String name,
        String emai,
        LocalDateTime createdAt,
        LocalDateTime checkInAt
) {
}
