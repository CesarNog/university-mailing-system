package com.university.mailing.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.university.mailing.domain.Student;

import com.university.mailing.repository.StudentRepository;
import com.university.mailing.web.rest.errors.BadRequestAlertException;
import com.university.mailing.web.rest.util.HeaderUtil;
import com.university.mailing.web.rest.util.PaginationUtil;
import com.university.mailing.service.dto.StudentDTO;
import com.university.mailing.service.mapper.StudentMapper;
import io.swagger.annotations.ApiParam;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing Mailing.
 */
@RestController
@RequestMapping("/api")
public class MailingResource {

    private final Logger log = LoggerFactory.getLogger(MailingResource.class);

    private final StudentRepository studentRepository;

    private final StudentMapper studentMapper;

    public MailingResource(StudentRepository studentRepository, StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }
    
    /**
     * POST  /maladireta: Create a post new student.
     *
     * @return the ResponseEntity with status 201 (Created) and with body the new studentDTO, or with status 400 (Bad Request) if the student has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/maladireta")
    @Timed
    public BodyBuilder createMailingStudentsOnRisk() throws URISyntaxException {
        log.debug("REST request to send Mailing for Students with score less than 7.0");

        return ResponseEntity.ok();
    }
   
}
