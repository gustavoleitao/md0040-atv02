import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import static org.junit.jupiter.api.Assertions.*;

class ClassTest {

    @Test
    void existsPerson() throws ClassNotFoundException {
        Class<?> clazzPerson = Class.forName("br.ufrn.imd.Person");
        assertNotNull(clazzPerson);
    }

    @Test
    void existsAttrNameInPerson() throws ClassNotFoundException, NoSuchFieldException {
        Class<?> clazzPerson = Class.forName("br.ufrn.imd.Person");
        Field fieldName = clazzPerson.getField("name");
        assertNotNull(fieldName);
        assertEquals("java.lang.String", fieldName.getGenericType().getTypeName());
    }

    @Test
    void existsAttrHometownInPerson() throws ClassNotFoundException, NoSuchFieldException {
        Class<?> clazzPerson = Class.forName("br.ufrn.imd.Person");
        Field fieldName = clazzPerson.getField("hometown");
        assertNotNull(fieldName);
        assertEquals("java.lang.String", fieldName.getGenericType().getTypeName());
    }

    @Test
    void existsMethodHometownInPerson() throws ClassNotFoundException, NoSuchMethodException {
        Class<?> clazzPerson = Class.forName("br.ufrn.imd.Person");
        Method method = clazzPerson.getMethod("hometown");
        System.out.println(method);
        assertNotNull(method);
        assertEquals(0, method.getParameterCount());
        assertEquals("java.lang.String", method.getGenericReturnType().getTypeName());
    }

    @Test
    void existsMethodNameInPerson() throws ClassNotFoundException, NoSuchMethodException {
        Class<?> clazzPerson = Class.forName("br.ufrn.imd.Person");
        Method method = clazzPerson.getMethod("name");
        System.out.println(method);
        assertNotNull(method);
        assertEquals(0, method.getParameterCount());
        assertEquals("java.lang.String", method.getGenericReturnType().getTypeName());
    }

    @Test
    void existsMusician() throws ClassNotFoundException {
        Class<?> clazzMusician = Class.forName("br.ufrn.imd.Musician");
        assertNotNull(clazzMusician);
    }

    @Test
    void existsAttrPlayClassicalMusicInMusician() throws ClassNotFoundException, NoSuchFieldException {
        Class<?> clazzPerson = Class.forName("br.ufrn.imd.Musician");
        Field fieldName = clazzPerson.getField("playClassicalMusic");
        assertNotNull(fieldName);
        assertEquals("boolean", fieldName.getGenericType().getTypeName());
    }

    @Test
    void existsAttrCanImproviseInMusician() throws ClassNotFoundException, NoSuchFieldException {
        Class<?> clazzPerson = Class.forName("br.ufrn.imd.Musician");
        Field fieldName = clazzPerson.getField("canImprovise");
        assertNotNull(fieldName);
        assertEquals("boolean", fieldName.getGenericType().getTypeName());
    }

    @Test
    void existsAttrCanComposeInMusician() throws ClassNotFoundException, NoSuchFieldException {
        Class<?> clazzPerson = Class.forName("br.ufrn.imd.Musician");
        Field fieldName = clazzPerson.getField("canCompose");
        assertNotNull(fieldName);
        assertEquals("boolean", fieldName.getGenericType().getTypeName());
    }

    @Test
    void existsMethodPlayInMusician() throws ClassNotFoundException, NoSuchMethodException {
        Class<?> clazzPerson = Class.forName("br.ufrn.imd.Musician");
        Method method = clazzPerson.getMethod("play");
        System.out.println(method);
        assertNotNull(method);
        assertEquals(0, method.getParameterCount());
        assertEquals("void", method.getGenericReturnType().getTypeName());
    }

    @Test
    void existsGuitarPlayer() throws ClassNotFoundException {
        Class<?> clazzGuitarPlayer = Class.forName("br.ufrn.imd.GuitarPlayer");
        assertNotNull(clazzGuitarPlayer);
    }

    @Test
    void existsMusicianExtendsPerson() throws ClassNotFoundException {
        Class<?> clazzMusician = Class.forName("br.ufrn.imd.Musician");
        Type superClazz = clazzMusician.getGenericSuperclass();
        assertEquals("br.ufrn.imd.Person", superClazz.getTypeName());
    }

    @Test
    void existsGuitarPlayerExtendsMusician() throws ClassNotFoundException {
        Class<?> clazzGP = Class.forName("br.ufrn.imd.GuitarPlayer");
        Type superClazz = clazzGP.getGenericSuperclass();
        assertEquals("br.ufrn.imd.Musician", superClazz.getTypeName());
    }

    @Test
    void existsAttrHowManyYearsInGuitarPlayer() throws ClassNotFoundException, NoSuchFieldException {
        Class<?> clazzPerson = Class.forName("br.ufrn.imd.GuitarPlayer");
        Field fieldName = clazzPerson.getField("howManyYears");
        assertNotNull(fieldName);
        assertEquals("int", fieldName.getGenericType().getTypeName());
    }

    @Test
    void existsAttrPlayEletronicGuitarInGuitarPlayer() throws ClassNotFoundException, NoSuchFieldException {
        Class<?> clazzPerson = Class.forName("br.ufrn.imd.GuitarPlayer");
        Field fieldName = clazzPerson.getField("playEletronicGuitar");
        assertNotNull(fieldName);
        assertEquals("boolean", fieldName.getGenericType().getTypeName());
    }

    @Test
    void existsAttrPlayAcousticGuitarInGuitarPlayer() throws ClassNotFoundException, NoSuchFieldException {
        Class<?> clazzPerson = Class.forName("br.ufrn.imd.GuitarPlayer");
        Field fieldName = clazzPerson.getField("playAcousticGuitar");
        assertNotNull(fieldName);
        assertEquals("boolean", fieldName.getGenericType().getTypeName());
    }

    @Test
    void existsMethodPlayGuitarInGuitarPlayer() throws ClassNotFoundException, NoSuchMethodException {
        Class<?> clazzPerson = Class.forName("br.ufrn.imd.GuitarPlayer");
        Method method = clazzPerson.getMethod("playGuitar");
        System.out.println(method);
        assertNotNull(method);
        assertEquals(0, method.getParameterCount());
        assertEquals("void", method.getGenericReturnType().getTypeName());
    }

}