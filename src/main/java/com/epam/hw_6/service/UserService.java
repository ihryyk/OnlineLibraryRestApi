package com.epam.hw_6.service;

import com.epam.hw_6.controller.dto.UserDTO;
import com.epam.hw_6.model.enums.LockStatus;
import com.epam.hw_6.service.exeption.ServiceException;

import java.util.List;

public interface UserService {

  public UserDTO create(UserDTO userDTO);

  public UserDTO update(UserDTO userDTO);

  public UserDTO getByEmailAndPassword(String email, String password) throws ServiceException;

  public UserDTO getByEmail(String email) throws ServiceException;

  public List<UserDTO> getAll() throws ServiceException;

  public void changeLockStatus(long userId, LockStatus lockStatus) throws ServiceException;

  public void delete(String email) throws ServiceException;
}
