package me.mstn.vimeworld.api.validator;

@FunctionalInterface
public interface IValidator<T> {

    /**
     * Проверяет верен ли объект
     *
     * @param object объект проверки.
     * @return <b>true</b> если объект верен, и <b>false</b> если нет.
     */
    boolean isValid(T object);

}
