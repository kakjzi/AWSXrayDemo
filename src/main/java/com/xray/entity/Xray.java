package com.xray.entity;
import com.xray.dto.XrayDTO;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Xray {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Builder
    public Xray(String name) {
        this.name = name;
    }

    public static Xray toEntity(XrayDTO xrayDTO) {
        return Xray.builder()
                   .name(xrayDTO.getName())
                   .build();
    }
}
