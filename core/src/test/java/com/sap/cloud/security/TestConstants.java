package com.sap.cloud.security;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.TemporalAmount;

import static java.time.ZoneOffset.UTC;

public class TestConstants {
	public static final Instant NOW = LocalDate.of(2019, 3, 3).atStartOfDay().toInstant(UTC);
	public static final TemporalAmount ONE_MINUTE = Duration.ofMinutes(1);
	public static final TemporalAmount ONE_SECOND = Duration.ofSeconds(1);
}
