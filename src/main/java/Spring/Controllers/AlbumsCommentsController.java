package Spring.Controllers;

import Spring.Entities.AlbumsComments;
import Spring.Services.AlbumsCommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.awt.*;
import java.util.Objects;

@RestController
@RequestMapping("/api")

public class AlbumsCommentsController {

    @Autowired
    private AlbumsCommentsService albumsCommentsService;

    @RequestMapping(value = "/albumscomments", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AlbumsComments> create(@RequestBody @Valid @NotNull AlbumsComments albumComment){
        albumsCommentsService.save(albumComment);
        return ResponseEntity.ok().body(albumComment);
    }
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/albumscomments", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AlbumsComments> delete(@PathVariable Integer id){
        albumsCommentsService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
