package ru.task.cache.db1.controlleer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.task.cache.db1.entity.Info;
import ru.task.cache.db1.exeption_handling.NoSuchInfoException;
import ru.task.cache.db1.service.InfoService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private InfoService infoService;

    @GetMapping("/info")
    public List<Info> getAllInfo() {

        List<Info> allInfo = infoService.getAllInfo();

        return allInfo;
    }

    @GetMapping("/info/{id}")
    public Info getInfo(@PathVariable long id) {

        Info info = infoService.getInfo(id);
        if (info == null) {
            throw new NoSuchInfoException("There is no object with this ID = " + id + " in the database");
        }
        return info;
    }

    @PostMapping("/info")
    public Info addNewInfo(@RequestBody Info info) {

        infoService.saveInfo(info);
        return info;
    }

    @PutMapping("/info")
    public Info updateInfo(@RequestBody Info info) {

        infoService.saveInfo(info);
        return info;
    }

    @DeleteMapping("/info/{id}")
    public String deleteInfo(@PathVariable long id) {

        Info info = infoService.getInfo(id);
        if (info == null) {
            throw new NoSuchInfoException("Employee with this ID = " + id + " does not exist");
        }
        infoService.deleteInfo(id);
        return "Object with this ID = " + id + " has been deleted";
    }


}
