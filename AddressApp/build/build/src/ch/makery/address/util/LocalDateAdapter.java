/**
 * 
 */
package ch.makery.address.util;

import java.time.LocalDate;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * @author kosea112
 *
 *에디터로 xml 파일을 열 때 생일이 비어 있는 <birthday/> 처럼
 *정확히 저장되지 않는다는 것을 알게 될 겁니다.
 *왜냐하면 JAXB는 LocalDate를 어떻게 XML로 변환해야 하는지 모르기 때문입니다.
 *이를 위해 커스텀 LocalDateAdapter가 필요합니다.
 *
 * LocalDate와 ISO 8601 간 변환을 하는 JAXB 어댑터
 * String은 '2012-12-03' 같은 날짜를 나타낸다.
 */
public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {

    @Override
    public LocalDate unmarshal(String v) throws Exception {
        return LocalDate.parse(v);
    }

    @Override
    public String marshal(LocalDate v) throws Exception {
        return v.toString();
    }
}