package com.netflix.movie;

import com.netflix.movie.controller.NetflixController;
import com.netflix.movie.model.Netflix;
import com.netflix.movie.repository.NetflixRepository;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        NetflixRepository netflixRepository = new NetflixRepository();
        NetflixController netflixController = new NetflixController();

        netflixRepository.getData();

        System.out.println("=================================");

        Scanner sc = new Scanner(System.in);
        List<Netflix> netflixList= netflixRepository.netflixList;

        while(true){
            menu();
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch)
            {
                case 1://sap xep theo ten su dung ham sort cua Collections
                    System.out.println("Phim sau khi sap xep");
                    Collections.sort(netflixList, new Comparator<Netflix>() {
                        @Override
                        public int compare(Netflix o1, Netflix o2) {
                            return o1.getTitle().compareTo(o2.getTitle());
                        }
                    });
                    printResult(netflixList);
                break;
                case 2: //tim kiem theo ten phim
                    System.out.println("Nhap ten phim muon tim");
                    String name = sc.nextLine();
                    netflixController.searchMovieByName(netflixList, name);
                    break;
                case 3:
                    System.out.println("Nhap the loai phim muon tim");
                    String cate = sc.nextLine();
                    netflixController.searchMovieByCategory(netflixList, cate);
                    break;
                case 4:
                    System.out.println("Nhap thoi gian phim muon xem");
                    String language = sc.nextLine();
                    netflixController.searchMovieByLanguage(netflixList, language);
                    break;
                case 5:
                    System.out.println("Sort xong phim thi no kieu : ");
                    netflixController.countMovieByTime();
                case 6:
                    System.exit(0 );
                    break;
                default:
                    break;
            }
        }
    }
    public static void menu(){
        System.out.println("Chuc nang: ");

        System.out.println("1. Sap xep theo ten phim");
        System.out.println("2. Tim kiem theo ten phim");
        System.out.println("3. Tim kiem theo the loai");
        System.out.println("4. Tim kiem theo language");
        System.out.println("5. sort theo thoi gian");
        System.out.println("6. Ket thuc chuong trinh");
    }

    public static void printResult(List<Netflix> list){
        for (Netflix netflix:list
             ) {
            System.out.println(netflix);
        }
    }
        
}
