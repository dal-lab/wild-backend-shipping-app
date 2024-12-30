package com.example.demo.domain.model;

public enum CargoStatus {
    NOT_RECEIVED,  // 아직 수령 전
    IN_TRANSIT,    // 운송 중
    DELIVERED,     // 최종 인도 완료
    MISDIRECTED    // 경로 이탈 등 (예시)
}
