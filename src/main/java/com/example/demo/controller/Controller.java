package com.example.demo.controller;

import com.example.demo.bean.*;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
public class Controller {
    @Autowired
    private BinekRepository binekRepository;
    @Autowired
    private IsMakinesiRepository isMakinesiRepository;
    @Autowired
    private OtobusRepository otobusRepository;
    @Autowired
    private KamyonRepository kamyonRepository;


    @GetMapping("/binek/search")
    @ResponseBody
    public List<Binek> getSearchedBinek(
            @RequestParam(defaultValue = "AklaGelmiyecek") String marka,
            @RequestParam(defaultValue = "-1") Integer model,
            @RequestParam(defaultValue = "-1") Integer fiyat,
            @RequestParam(defaultValue = "AklaGelmiyecek") String renk,
            @RequestParam(defaultValue = "AklaGelmiyecek") String yakit,
            @RequestParam(defaultValue = "AklaGelmiyecek") String sehir,
            @RequestParam(defaultValue = "AklaGelmiyecek") String tip,
            @RequestParam(defaultValue = "AklaGelmiyecek") String vites
    ) {
        List<String> ignored = new ArrayList<>();
        ignored.add("id");
        if (marka.equalsIgnoreCase("AklaGelmiyecek")){
            ignored.add("marka");
        }
        if (model.equals(-1)) {
            ignored.add("model");
        }
        if (fiyat.equals(-1)) {
            ignored.add("fiyat");
        }
        if (renk.equalsIgnoreCase("AklaGelmiyecek")){
            ignored.add("renk");
        }
        if (yakit.equalsIgnoreCase("AklaGelmiyecek")){
            ignored.add("yakit");
        }
        if (sehir.equalsIgnoreCase("AklaGelmiyecek")){
            ignored.add("sehir");
        }
        if (tip.equalsIgnoreCase("AklaGelmiyecek")){
            ignored.add("tip");
        }
        if (vites.equalsIgnoreCase("AklaGelmiyecek")){
            ignored.add("vites");
        }

        String[] str = new String[ignored.size()];

        for (int i = 0; i < ignored.size(); i++) {
            str[i] = ignored.get(i);
        }

        Binek binek = new Binek(0L, marka, model, fiyat, renk, yakit, sehir, tip, vites);

        ExampleMatcher customExampleMatcher = ExampleMatcher.matchingAll().withIgnoreCase().withIgnorePaths(str);
        Example<Binek> example = Example.of(binek, customExampleMatcher);
        return binekRepository.findAll(example);
    }

    @GetMapping("/ismakinesi/search")
    @ResponseBody
    public List<IsMakinesi> getSearchedIsMakinesi(
            @RequestParam(defaultValue = "AklaGelmiyecek") String marka,
            @RequestParam(defaultValue = "-1") Integer model,
            @RequestParam(defaultValue = "-1") Integer fiyat,
            @RequestParam(defaultValue = "AklaGelmiyecek") String renk,
            @RequestParam(defaultValue = "AklaGelmiyecek") String yakit,
            @RequestParam(defaultValue = "AklaGelmiyecek") String sehir,
            @RequestParam(defaultValue = "-1") Integer agirlik,
            @RequestParam(defaultValue = "AklaGelmiyecek") String tip
    ) {
        List<String> ignored = new ArrayList<>();
        ignored.add("id");
        if (marka.equalsIgnoreCase("AklaGelmiyecek")){
            ignored.add("marka");
        }
        if (model.equals(-1)) {
            ignored.add("model");
        }
        if (fiyat.equals(-1)) {
            ignored.add("fiyat");
        }
        if (renk.equalsIgnoreCase("AklaGelmiyecek")){
            ignored.add("renk");
        }
        if (yakit.equalsIgnoreCase("AklaGelmiyecek")){
            ignored.add("yakit");
        }
        if (sehir.equalsIgnoreCase("AklaGelmiyecek")){
            ignored.add("sehir");
        }
        if (agirlik.equals(-1)){
            ignored.add("vites");
        }
        if (tip.equalsIgnoreCase("AklaGelmiyecek")){
            ignored.add("tip");
        }

        String[] str = new String[ignored.size()];

        for (int i = 0; i < ignored.size(); i++) {
            str[i] = ignored.get(i);
        }

        IsMakinesi isMakinesi = new IsMakinesi(0L, marka, model, fiyat, renk, yakit, sehir, agirlik, tip);

        ExampleMatcher customExampleMatcher = ExampleMatcher.matchingAll().withIgnoreCase().withIgnorePaths(str);
        Example<IsMakinesi> example = Example.of(isMakinesi, customExampleMatcher);
        return isMakinesiRepository.findAll(example);
    }
    @GetMapping("/otobus/search")
    @ResponseBody
    public List<Otobus> getSearchedOtobus(
            @RequestParam(defaultValue = "AklaGelmiyecek") String marka,
            @RequestParam(defaultValue = "-1") Integer model,
            @RequestParam(defaultValue = "-1") Integer fiyat,
            @RequestParam(defaultValue = "AklaGelmiyecek") String renk,
            @RequestParam(defaultValue = "AklaGelmiyecek") String yakit,
            @RequestParam(defaultValue = "AklaGelmiyecek") String sehir,
            @RequestParam(defaultValue = "-1") Integer uzunluk,
            @RequestParam(defaultValue = "-1") Integer koltukSayisi
    ) {
        List<String> ignored = new ArrayList<>();
        ignored.add("id");
        if (marka.equalsIgnoreCase("AklaGelmiyecek")){
            ignored.add("marka");
        }
        if (model.equals(-1)) {
            ignored.add("model");
        }
        if (fiyat.equals(-1)) {
            ignored.add("fiyat");
        }
        if (renk.equalsIgnoreCase("AklaGelmiyecek")){
            ignored.add("renk");
        }
        if (yakit.equalsIgnoreCase("AklaGelmiyecek")){
            ignored.add("yakit");
        }
        if (sehir.equalsIgnoreCase("AklaGelmiyecek")){
            ignored.add("sehir");
        }
        if (uzunluk.equals(-1)){
            ignored.add("vites");
        }
        if (koltukSayisi.equals(-1)){
            ignored.add("vites");
        }

        String[] str = new String[ignored.size()];

        for (int i = 0; i < ignored.size(); i++) {
            str[i] = ignored.get(i);
        }

        Otobus otobus = new Otobus(0L, marka, model, fiyat, renk, yakit, sehir, uzunluk, koltukSayisi);

        ExampleMatcher customExampleMatcher = ExampleMatcher.matchingAll().withIgnoreCase().withIgnorePaths(str);
        Example<Otobus> example = Example.of(otobus, customExampleMatcher);
        return otobusRepository.findAll(example);
    }
    @GetMapping("/kamyon/search")
    @ResponseBody
    public List<Kamyon> getSearchedIsMakinesi(
            @RequestParam(defaultValue = "AklaGelmiyecek") String marka,
            @RequestParam(defaultValue = "-1") Integer model,
            @RequestParam(defaultValue = "-1") Integer fiyat,
            @RequestParam(defaultValue = "AklaGelmiyecek") String renk,
            @RequestParam(defaultValue = "AklaGelmiyecek") String yakit,
            @RequestParam(defaultValue = "AklaGelmiyecek") String sehir,
            @RequestParam(defaultValue = "-1") Integer uzunluk,
            @RequestParam(defaultValue = "-1") Integer tasiyabilecekYuk
    ) {
        List<String> ignored = new ArrayList<>();
        ignored.add("id");
        if (marka.equalsIgnoreCase("AklaGelmiyecek")){
            ignored.add("marka");
        }
        if (model.equals(-1)) {
            ignored.add("model");
        }
        if (fiyat.equals(-1)) {
            ignored.add("fiyat");
        }
        if (renk.equalsIgnoreCase("AklaGelmiyecek")){
            ignored.add("renk");
        }
        if (yakit.equalsIgnoreCase("AklaGelmiyecek")){
            ignored.add("yakit");
        }
        if (sehir.equalsIgnoreCase("AklaGelmiyecek")){
            ignored.add("sehir");
        }
        if (uzunluk.equals(-1)){
            ignored.add("vites");
        }
        if (tasiyabilecekYuk.equals(-1)){
            ignored.add("vites");
        }

        String[] str = new String[ignored.size()];

        for (int i = 0; i < ignored.size(); i++) {
            str[i] = ignored.get(i);
        }

        Kamyon kamyon = new Kamyon(0L, marka, model, fiyat, renk, yakit, sehir, uzunluk, tasiyabilecekYuk);

        ExampleMatcher customExampleMatcher = ExampleMatcher.matchingAll().withIgnoreCase().withIgnorePaths(str);
        Example<Kamyon> example = Example.of(kamyon, customExampleMatcher);
        return kamyonRepository.findAll(example);
    }

    //Binek
    @GetMapping("/binek")
    @ResponseBody
    public List<Binek> getAllBinek() {
        return binekRepository.findByMarkaContaining("");
    }

    @GetMapping("/binek/{id}")
    @ResponseBody
    public Binek getBinekDetails(@PathVariable long id) {
        Optional<Binek> binek = binekRepository.findAllById(id);
        if (binek.isEmpty()) {
            throw new RuntimeException("Car not found with id " + id);
        }
        return binek.get();
    }

    @PostMapping("/binek")
    @ResponseBody
    public Binek createBinek(@RequestBody Binek binek) {
        System.out.println("Car" + binek.toString());
       return binekRepository.save(binek);
    }


    @DeleteMapping("/binek/{id}")
    @ResponseBody
    public void deleteBinek(@PathVariable long id) {
        binekRepository.deleteById(id);
    }
    //IsMakinesi
    @GetMapping("/ismakinesi")
    public List<IsMakinesi> getAllIsMakinesi() {
        return isMakinesiRepository.findByMarkaContaining("");
    }

    @GetMapping("/ismakinesi/{id}")
    public IsMakinesi getIsMakinesiDetails(@PathVariable long id) {
        Optional<IsMakinesi> isMakinesi = isMakinesiRepository.findAllById(id);
        if (isMakinesi.isEmpty()) {
            throw new RuntimeException("isMakinesi not found with id " + id);
        }
        return isMakinesi.get();
    }

    @PostMapping("/ismakinesi")
    public IsMakinesi createIsMakinesi(@RequestBody IsMakinesi isMakinesi) {
        System.out.println("isMakinesi" + isMakinesi.toString());
        return isMakinesiRepository.save(isMakinesi);
    }
    @CrossOrigin
    @DeleteMapping("/ismakinesi/{id}")
    public void deleteIsMakinesi(@PathVariable long id) {
        isMakinesiRepository.deleteById(id);
    }
    //Otobus
    @GetMapping("/otobus")
    public List<Otobus> getAllOtobus() {
        return otobusRepository.findByMarkaContaining("");
    }

    @GetMapping("/otobus/{id}")
    public Otobus getOtobusDetails(@PathVariable long id) {
        Optional<Otobus> otobus = otobusRepository.findAllById(id);
        if (otobus.isEmpty()) {
            throw new RuntimeException("Otobus not found with id " + id);
        }
        return otobus.get();
    }

    @PostMapping("/otobus")
    public Otobus createOtobus(@RequestBody Otobus otobus) {
        System.out.println("Otobus" + otobus.toString());
        return otobusRepository.save(otobus);
    }

    @DeleteMapping("/otobus/{id}")
    public void deleteOtobus(@PathVariable long id) {
        otobusRepository.deleteById(id);
    }
    //Kamyon
    @GetMapping("/kamyon")
    public List<Kamyon> getAllKamyon() {
        return kamyonRepository.findByMarkaContaining("");
    }

    @GetMapping("/kamyon/{id}")
    public Kamyon getKamyonDetails(@PathVariable long id) {
        Optional<Kamyon> kamyon = kamyonRepository.findAllById(id);
        if (kamyon.isEmpty()) {
            throw new RuntimeException("Kamyon not found with id " + id);
        }
        return kamyon.get();
    }

    @PostMapping("/kamyon")
    @ResponseBody
    public Kamyon createKamyon(@RequestBody Kamyon kamyon) {
        System.out.println("Kamyon" + kamyon.toString());
        return kamyonRepository.save(kamyon);
    }

    @DeleteMapping("/kamyon/{id}")
    public void deleteKamyon(@PathVariable long id) {
        kamyonRepository.deleteById(id);
    }
}
