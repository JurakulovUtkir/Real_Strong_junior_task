package uz.pdp.corxona_telecom.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import uz.pdp.corxona_telecom.payload.ApiResponse;
import uz.pdp.corxona_telecom.payload.CompanyDto;
import uz.pdp.corxona_telecom.service.CompanyService;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/api/company")
@RequiredArgsConstructor
public class CompanyController {
    private final CompanyService companyService;

    /**
     * all  companies
     *
     * @return
     */
    @PreAuthorize(value = "hasAnyRole(admin,company)")
    @GetMapping("/list")
    public HttpEntity<?> all() {
        ApiResponse apiResponse = companyService.all();
        return ResponseEntity.ok(apiResponse);
    }

    /**
     * adding new company
     *
     * @param dto
     * @return
     */
    @PreAuthorize(value = "hasAnyRole(admin)")
    @PostMapping("/add")
    public HttpEntity<?> add(@Valid @RequestBody CompanyDto dto) {
        ApiResponse apiResponse = companyService.add(dto);
        return ResponseEntity.status(apiResponse.isSuccess() ? 201 : 409).body(apiResponse);
    }


    /**
     * delete one from companies
     *
     * @param id
     * @return
     */
    @DeleteMapping("/delete/{id}")
    public HttpEntity<?> delete(@PathVariable UUID id) {
        ApiResponse apiResponse = companyService.delete(id);
        return ResponseEntity.status(apiResponse.isSuccess() ? 200 : 409).body(apiResponse);
    }

    /**
     * editing one using its id and some new information of it
     * @param id
     * @param dto
     * @return
     */
    @PutMapping("/edit/{id}")
    public HttpEntity<?> edit(@PathVariable UUID id,@Valid@RequestBody CompanyDto dto){
        ApiResponse apiResponse = companyService.edit(id,dto);
        return ResponseEntity.status(apiResponse.isSuccess() ? 200 : 409).body(apiResponse);
    }



}
