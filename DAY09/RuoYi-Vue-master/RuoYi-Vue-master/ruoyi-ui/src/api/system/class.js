import request from '@/utils/request'

// 查询班级管理列表
export function listClass(query) {
  return request({
    url: '/system/class/list',
    method: 'get',
    params: query
  })
}

// 查询班级管理详细
export function getClass(id) {
  return request({
    url: '/system/class/' + id,
    method: 'get'
  })
}

// 新增班级管理
export function addClass(data) {
  return request({
    url: '/system/class',
    method: 'post',
    data: data
  })
}

// 修改班级管理
export function updateClass(data) {
  return request({
    url: '/system/class',
    method: 'put',
    data: data
  })
}

// 删除班级管理
export function delClass(id) {
  return request({
    url: '/system/class/' + id,
    method: 'delete'
  })
}

// 开课
export function beginClass(data) {
  return request({
    url: '/system/class/beginClass',
    method: 'put',
    data: data
  })
}
  //结课
  export function endClass(data) {
    return request({
      url: '/system/class/endClass',
      method: 'put',
      data: data
    })
}