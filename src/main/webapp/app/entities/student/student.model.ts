import { BaseEntity } from './../../shared';

export class Student implements BaseEntity {
    constructor(
        public id?: number,
        public document?: string,
        public name?: string,
        public address?: string,
        public zipCode?: string,
    ) {
    }
}
