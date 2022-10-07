package com.xray.controller;

import com.xray.dto.XrayDTO;
import com.xray.service.XrayService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class XrayController {
    private final XrayService xrayService;

    @GetMapping("/xray")
    public List<XrayDTO> getXraies() {
        return xrayService.getXraies();
    }

    @GetMapping("/xray/{id}")
    public XrayDTO getXray(@PathVariable Long id) {
        return xrayService.getXray(id);
    }

    @PostMapping("/xray")
    public void createXray(@RequestBody List<XrayDTO> xrayDTOS) {
        xrayService.createXray(xrayDTOS);
    }

    @DeleteMapping("/xray/{id}")
    public void removeXray(@PathVariable Long id) {
        xrayService.removeXray(id);
    }

    @GetMapping("/api/xray")
    public List<XrayDTO> getXraiesWithRestTemplate() {
        return xrayService.getXraiesWithRestTemplate();
    }
}
