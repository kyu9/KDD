/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.34).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package me.kdshim.kdd_j.swagger.api;

import me.kdshim.kdd_j.swagger.model.ErrorResponseDto;
import me.kdshim.kdd_j.swagger.model.GetTODODto;
import me.kdshim.kdd_j.swagger.model.GetTodoDtoList;
import me.kdshim.kdd_j.swagger.model.PostTODODto;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@Validated
@Api(value = "todo", description = "the todo API")
public interface TodoApi {

    TodoApiDelegate getDelegate();

    @ApiOperation(value = "모든 TODO 조회", nickname = "getAllTodo", notes = "모든 TODO 조회", response = GetTodoDtoList.class, tags={ "TODO", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "성공", response = GetTodoDtoList.class),
        @ApiResponse(code = 400, message = "실패", response = ErrorResponseDto.class) })
    @RequestMapping(value = "/todo/all",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<GetTodoDtoList> getAllTodo() {
        return getDelegate().getAllTodo();
    }


    @ApiOperation(value = "Get UNDONE TODO", nickname = "getUndoneTodo", notes = "상태가 UNDONE인 TODO를 모두 가져온다", response = GetTodoDtoList.class, tags={ "TODO", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "성공", response = GetTodoDtoList.class) })
    @RequestMapping(value = "/todo/undone",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<GetTodoDtoList> getUndoneTodo() {
        return getDelegate().getUndoneTodo();
    }


    @ApiOperation(value = "my TODO 등록", nickname = "postTODO", notes = "my TODO 등록", response = GetTODODto.class, tags={ "TODO", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "성공", response = GetTODODto.class),
        @ApiResponse(code = 400, message = "실패", response = ErrorResponseDto.class) })
    @RequestMapping(value = "/todo",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    default ResponseEntity<GetTODODto> postTODO(@ApiParam(value = "" ) @Valid @RequestBody PostTODODto body) {
        return getDelegate().postTODO(body);
    }

}

