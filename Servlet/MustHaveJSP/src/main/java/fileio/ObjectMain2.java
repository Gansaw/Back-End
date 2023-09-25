package fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import membership.MemberDTO;

public class ObjectMain2 {

    public void serialize(List<MemberDTO> list, String fileName) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos);) {

            oos.writeObject(list);
        }
    }

    public List<MemberDTO> deserialize1(String fileName) throws IOException, ClassNotFoundException {
        List<MemberDTO> list;
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis);) {
            list = (List<MemberDTO>) ois.readObject();
        }
        return list;
    }

    public static void main(String[] args) throws Exception {

        ObjectMain2 om = new ObjectMain2();

        List<MemberDTO> list = new ArrayList<>();
        list.add(new MemberDTO("id1", "1234", "홍길동1", "2023-05-31"));
        list.add(new MemberDTO("id2", "1345", "홍길동2", "2023-05-31"));
        list.add(new MemberDTO("id3", "1456", "홍길동3", "2023-05-31"));
        list.add(new MemberDTO("id4", "1567", "홍길동4", "2023-05-31"));

        om.serialize(list, "testObjects.dat");

        List<MemberDTO> deserializedList = om.deserialize1("testObjects.dat");

        for (MemberDTO m : deserializedList)
            System.out.println(m);
    }
}
