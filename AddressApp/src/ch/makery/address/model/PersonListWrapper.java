/**
 * 
 */
package ch.makery.address.model;

/**
 * @author kosea112
 * 레지스터에 xml파일을 저장하고 불러오기
 */

import java.util.List;

import javax.xml.bind.annotation.XmlElement;		//에노테이션 설정 (person타입으로 만들 수 있다.)
import javax.xml.bind.annotation.XmlRootElement;	

/**
 * 연락처 리스트를 감싸는 헬퍼 클래스이다.
 * XML로 저장하는 데 사용된다.
 *
 * @author Marco Jakob
 */
@XmlRootElement(name = "persons")
public class PersonListWrapper {

    private List<Person> persons; // 한 사람만 저장할게 아니므로 List<Person>으로 감쌌다.

    @XmlElement(name = "person")
    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
